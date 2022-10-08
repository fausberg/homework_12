package task1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Document.readSmallFile();
        } catch (IvalidException e) {
        } catch (IOException e) {
        }
    }
}