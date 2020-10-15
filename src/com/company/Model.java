package com.company;
import javax.swing.JOptionPane;
public class Model {
    private View v;
    private static String[][] field;
    public static String msg = "";
    private static int playerKind = 0;
    private static Boolean winProgress = false;
    public Model() {
        this.field = new String[3][3];
    }
    public void SetView(View v) {
        this.v = v;
    }
    public static void CheckWin(String[][] arr,String n)
    {

        if ((arr[0][0]==n && arr[1][1] ==n && arr[2][2] == n) ||
                (arr[2][0] == n && arr[1][1] == n && arr[0][2] == n))
            winProgress=true;
        for (int i = 0; i < 3; i++)
            if ((arr[i][0] == n && arr[i][1] == n && arr[i][2] == n) ||
                    (arr[0][i] == n && arr[1][i] == n && arr[2][i] == n))
                winProgress=true;
            if(winProgress)
            {
                for (int i = 0; i<3 ;i++) {
                    for(int j = 0; j<3 ;j++) {
                        if (field[i][j] != "")
                            field[i][j] = "Win!";
                    }
                }
                if (playerKind==0)
                    JOptionPane.showMessageDialog(null, "Победил нолик");
                else
                    JOptionPane.showMessageDialog(null, "Победил крестик");
            }
    }
    public void PlayMove(int x, int y) {
            if(playerKind == 0)
            {
                field[x][y] = "X";
                CheckWin(field,"X");
                playerKind = 1;
            }
            else if(playerKind ==1)
            {
                field[x][y] = "0";
                CheckWin(field,"0");
                playerKind = 0;
            }
}
}

