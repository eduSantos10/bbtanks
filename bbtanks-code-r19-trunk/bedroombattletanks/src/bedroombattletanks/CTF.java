package bedroombattletanks;

import jgame.platform.JGEngine;

public class CTF extends GameType {

	CTF(GameInfo gameInfo, JGEngine eng) {
		super(gameInfo);
		new MapGenerator(gameInfo, eng);
	/*	gameInfo.map1.add(new Rug(200, 200, 'V', gameInfo));
		gameInfo.map1.add(new Bed(0, 545, 'H', gameInfo));
		gameInfo.map1.add(new Bed(760, 0, 'V', gameInfo));
		gameInfo.map1.add(new Chair(800, 475, 'H', gameInfo));
		gameInfo.map1.add(new Chair(425, 50, 'H', gameInfo));
		gameInfo.map1.add(new Pencil(700, 300, 'V', gameInfo));
		gameInfo.map1.add(new Pencil(300, 500, 'H', gameInfo)); */
		new Base(50, 50, gameInfo, gameInfo.allTanks.get(0), "red");
		new Base(gameInfo.pfWidth-100, gameInfo.pfHeight-100, gameInfo, gameInfo.allTanks.get(1), "blue");
		}
}
