package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.Scanner;

/**
 *
 * @author PLATINADO
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();
        
        while(true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("sourcde: ");
            ChessPosition source = UI.readChessPosition(sc);
            
            System.out.println();
            
            System.out.print("target: ");
            ChessPosition target = UI.readChessPosition(sc);
            
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            
        }
        

    }

}
