package com.javarush.task.pro.task13.task1335;

/* 
Дорога к выходу
*/

import java.util.List;

public class Solution {

    public static void main(String[] args) {
        printList(clearBoard());
    }

    public static List<Board.Node> clearBoard() {
        Board board = new Board();
        List<Board.Node> boardNodes = board.getBoardNodes();
        for (int i = 0; i < boardNodes.size(); i++) {
            Board.Node node = boardNodes.get(i);
            String data = node.getData();
            if(!data.equals("board")){
                node.setData("board");
            }
        }
        return boardNodes;
    }

    private static void printList(List<?> list) {
        list.forEach(element -> System.out.print(element + " "));
    }
}
