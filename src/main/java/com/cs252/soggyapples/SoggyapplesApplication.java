package com.cs252.soggyapples;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;



@SpringBootApplication
public class SoggyapplesApplication {
//	static String sid_path = "/Users/SiD/Desktop/coding/soggyapples/src/main/webapp/WEB-INF/serviceAccountKey.json";
//	static String risheek_path = "/Users/risheek/projects/soggyapples/src/main/webapp/WEB-INF/serviceAccountKey.json";
	public static void main(String[] args) throws IOException {
		//webapp/WEB-INF/jsp/serviceAccountKey.json
		//java/com/cs252/soggyapples/SoggyapplesApplication.java
		FileInputStream serviceAccount = new FileInputStream("serviceAccountKey.json");
		FirebaseOptions options = new FirebaseOptions.Builder()
			    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
			    .setDatabaseUrl("https://soggyapples-110e5.firebaseio.com/")
			    .build();
		FirebaseApp.initializeApp(options);
		
		SpringApplication.run(SoggyapplesApplication.class, args);
		
	}
	
}
