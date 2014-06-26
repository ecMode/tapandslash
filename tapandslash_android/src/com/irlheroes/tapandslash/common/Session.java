package com.irlheroes.tapandslash.common;

import java.util.ArrayList;

import com.irlheroes.tapandslash.R;

public final class Session 
{
	public static ArrayList<Character> AllCharacters;
	public static int MAX_CHARACTERS = 8;
	
	/*
	 * Will eventually load the users characters from the db into the session. Faked for now.
	 */
	public static void LoadCharacters()
	{
		AllCharacters = new ArrayList<Character>();
		AllCharacters.add(new Character("Mage", 100, 10, R.drawable.ic_mage));
		for (int i = AllCharacters.size(); i < MAX_CHARACTERS; i++)
			AllCharacters.add(new Character(""));
	}
	
	/*
	 * Starting point to load the game. WIll do things like load characters, items, 
	 * etc from database on startup.
	 */
	public static void Load()
	{
		LoadCharacters();
		
	}
}

