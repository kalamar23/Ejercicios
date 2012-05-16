package com.namex.tweet;

import java.io.IOException;

import javax.swing.JOptionPane;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class NamexTweet2 {

	private final static String CONSUMER_KEY = "Xh0edRWU2efcRhsiSZ36A";
	private final static String CONSUMER_KEY_SECRET = "tifWDMJPymivIKzRCtPSUBfMpD8hiynORnmuwqtG4";

	public void start() throws TwitterException, IOException {

		Twitter twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_KEY_SECRET);

		// here's the difference
		String accessToken = getSavedAccessToken();
		String accessTokenSecret = getSavedAccessTokenSecret();
		AccessToken oathAccessToken = new AccessToken(accessToken,
				accessTokenSecret);

		twitter.setOAuthAccessToken(oathAccessToken);
		// end of difference
		String estado = JOptionPane.showInputDialog("Que desea decir : ");
		if (!estado.isEmpty())
			twitter.updateStatus(estado);

		System.out.println("\nMy Timeline:");

		// I'm reading your timeline
		ResponseList<Status> list = twitter.getHomeTimeline();
		for (Status each : list) {

			System.out.println("Enviado por: @"
					+ each.getUser().getScreenName() + " - "
					+ each.getUser().getName() + "\n" + each.getText() + "\n");
		}

	}

	private String getSavedAccessTokenSecret() {
		// consider this is method to get your previously saved Access Token
		// Secret
		return "uARFnvK2nUu4cKH2c6DaI72mKkFfab9OpTzcecj0";
	}

	private String getSavedAccessToken() {
		// consider this is method to get your previously saved Access Token
		return "193986680-I2K3TErW9mROxW6kluXAGl2xe1IcADpywuYBIffa";
	}

	public static void main(String[] args) throws Exception {
		new NamexTweet().start();

	}

}