package com.namex.tweet;

//import java.net.URL;
//import java.net.URLConnection;
// import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import java.awt.Desktop.*;

public class NamexTweet {
	private final static String CONSUMER_KEY = "Xh0edRWU2efcRhsiSZ36A";
	private final static String CONSUMER_KEY_SECRET = "tifWDMJPymivIKzRCtPSUBfMpD8hiynORnmuwqtG4";

	public void start() throws TwitterException, IOException {

		Twitter twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_KEY_SECRET);
		RequestToken requestToken = twitter.getOAuthRequestToken();
		/*System.out.println("URL de autorización: \n"
				+ requestToken.getAuthorizationURL());*/

		
		/*URL url = new URL(requestToken.getAuthorizationURL());
		  URLConnection con = url.openConnection();
		  
		 BufferedReader in = new BufferedReader( new
		 InputStreamReader(con.getInputStream()));
		  
		 String linea; while ((linea = in.readLine()) != null) {
		 System.out.println(linea); }
		 */
		AccessToken accessToken = null;

String url3 = requestToken.getAuthorizationURL();;
java.awt.Desktop.getDesktop().browse(java.net.URI.create(url3));
		ImageIcon icono = new ImageIcon("/images/twitter.jpg");
		while (null == accessToken) {
			try {
				String pin;
				do {
					pin = JOptionPane.showInputDialog("Ingrese el PIN");
				
				} while (pin == null);

				accessToken = twitter.getOAuthAccessToken(requestToken, pin);

			} catch (TwitterException te) {

				System.out.println("No se ha podido acceder al token de acceso, causado por: "
								+ te.getMessage());
				JOptionPane.showInputDialog("Reingrese el PIN");

			}
		}

		System.out.println("Token de acceso: " + accessToken.getToken());
		System.out.println("Access Token Secret:"
				+ accessToken.getTokenSecret());
		String estado = JOptionPane.showInputDialog("Que desea decir : ");
		if (!estado.isEmpty())
			twitter.updateStatus(estado);

	}

	public static void main(String[] args) throws Exception {
		new NamexTweet().start();// run the Twitter client
	}
}