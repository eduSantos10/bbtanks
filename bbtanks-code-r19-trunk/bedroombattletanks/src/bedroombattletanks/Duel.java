package bedroombattletanks;

import jgame.platform.JGEngine;

public class Duel extends GameType {

	Duel(GameInfo gameInfo, JGEngine eng) {
		super(gameInfo);
		new MapGenerator(gameInfo, eng);
		}
}
