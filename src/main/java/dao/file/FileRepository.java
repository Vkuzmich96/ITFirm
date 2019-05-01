package dao.file;

import dao.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileRepository implements Repository {

    public boolean update() {
        return false;
    }

    public boolean remove() {
        return false;
    }

    public boolean insert() {
        return false;
    }

    public String read(){
        try(BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("file.txt"))) {
            return bufferedReader.readLine();
        }catch (IOException e){
            return null;
        }
    }
}
