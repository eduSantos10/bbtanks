package bedroombattletanks;

import jgame.platform.JGEngine;

public class CTF extends GameType {

	CTF(GameInfo gameInfo, JGEngine eng) {
		super(gameInfo);
		new MapGenerator(gameInfo, eng);
		new Base(50, 50, gameInfo, gameInfo.allTanks.get(0), "red");
		new Base(gameInfo.pfWidth-100, gameInfo.pfHeight-100, gameInfo, gameInfo.allTanks.get(1), "blue");
		}
}
