class DetectDrawCondition {
    static boolean isDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        char[][] board = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'O', 'X', 'O'}
        };

        if (isDraw(board)) {
            System.out.println("Match is a Draw!");
        } else {
            System.out.println("Game is still ongoing.");
        }
    }
}