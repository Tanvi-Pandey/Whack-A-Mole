package manager;

import exception.HighScoreException;
import model.PlayerScore;

import java.io.*;
import java.util.ArrayList;

public class HighScoreManager {

    private static final String FILE_NAME = "scores.dat";

    public void saveScores(ArrayList<PlayerScore> scores)
            throws HighScoreException {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(FILE_NAME)
                    );

            oos.writeObject(scores);

            oos.close();

        }
        catch (IOException e) {

            throw new HighScoreException(
                    "Failed to save scores",
                    e
            );
        }
    }

    public ArrayList<PlayerScore> loadScores()
            throws HighScoreException {

        try {

            File file = new File(FILE_NAME);

            if(!file.exists()) {
                return new ArrayList<>();
            }

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream(FILE_NAME)
                    );

            ArrayList<PlayerScore> scores =
                    (ArrayList<PlayerScore>) ois.readObject();

            ois.close();

            return scores;
        }
        catch (IOException | ClassNotFoundException e) {

            throw new HighScoreException(
                    "Failed to load scores",
                    e
            );
        }
    }
}