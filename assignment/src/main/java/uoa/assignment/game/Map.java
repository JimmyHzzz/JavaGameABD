package uoa.assignment.game;

import uoa.assignment.character.GameCharacter;
import uoa.assignment.character.Monster;
import uoa.assignment.character.Player;

public class Map {

    public String [][] layout;
    public GameCharacter characters [] = new GameCharacter[4];



    public int height;
    public int width;


    Map (int height, int width) {
        // 创建地图大小
        this.height = height;
        this.width = width;
        layout = new String[height][width];

        // 初始化地图
        initialiseArray();

        // 定义玩家怪物的位置
        characters[0] = new Player("player");
        characters[0].row = height - 1;  // 右下角
        characters[0].column = width - 1;

        characters[1] = new Monster("monster1");
        characters[1].row = 0;  // 右上角
        characters[1].column = width - 1;

        characters[2] = new Monster("monster2");
        characters[2].row = height - 1;  // 左下角
        characters[2].column = 0;

        characters[3] = new Monster("monster3");
        characters[3].row = 0;  // 左上角
        characters[3].column = 0;

        // 修改玩家怪物符号
        layout[characters[0].row][characters[0].column] = "*";
        layout[characters[1].row][characters[1].column] = "%";
        layout[characters[2].row][characters[2].column] = "%";
        layout[characters[3].row][characters[3].column] = "%";
    }

    private void initialiseArray() {
        for (int x = 0; x < this.height; x++) {
            for (int y = 0; y < this.width; y++) {
                layout[x][y]=".";
            }
        }
    }

    public void printLayout() {
        for (int x = 0; x < this.height; x++) {
            for (int y = 0; y < this.width; y++) {
                System.out.print(layout[x][y] + "");
            }
            System.out.println();
        }
    }
}