package ex18;

import java.util.*;

public class BattleShips {


    public static Map<String, Double> damagedOrSunk(final int[][] board, final int[][] attacks) {
        List<Integer> original = creteListFromTwoDimensionArray(board);
        List<Integer> copiedBoard = creteListFromTwoDimensionArray(board);

        for (int i = 0; i < attacks.length; i++) {
            copiedBoard.set((attacks[i][0]-1)+Math.abs(attacks[i][1]-board.length)*(board[0].length),-1);
        }
        return pointsCounting(copiedBoard,original);
    }

    private static Map<String, Double> pointsCounting(List<Integer> afterGame, List<Integer> orginal) {
        Map<Integer, Integer> mapOriginal = new HashMap<>();
        Map<Integer, Integer> mapAfterGame = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            mapOriginal.put(i + 1, Collections.frequency(orginal, i + 1));
            mapAfterGame.put(i + 1, Collections.frequency(afterGame, i + 1));
        }
        return getShipsAndQuantity(mapOriginal, mapAfterGame);
    }

    private static List<Integer> creteListFromTwoDimensionArray(int[][] board) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                list.add(board[i][j]);
            }
        }
        return list;
    }

    private static Map<String, Double> getShipsAndQuantity(Map<Integer, Integer> mapOriginal, Map<Integer, Integer> mapAfterGame) {
        double sunked = 0;
        double damaged = 0;
        double notTouched = 0;
        for (int i = 0; i < 4; i++) {
            int valueFromOrginal = mapOriginal.get(i + 1);
            int valueAfterGame = mapAfterGame.get(i + 1);

            if (valueFromOrginal == 0) continue;
            if (valueFromOrginal == valueAfterGame) {
                notTouched++;
                continue;
            }
            if (valueAfterGame == 0) {
                sunked++;
                continue;
            }
            if (valueFromOrginal > valueAfterGame) {
                damaged++;
                continue;
            }

        }

        Map<String, Double> output = new HashMap<>();
        output.put("sunk", Double.valueOf(sunked));
        output.put("damaged", Double.valueOf(damaged));
        output.put("notTouched", Double.valueOf(notTouched));
        output.put("points", Double.valueOf(sunked + damaged / 2 - notTouched));
        return output;

    }

}