import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String command = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            command = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Main main = new Main();
        main.fizzBuzzer("C:/Users/Admin/Desktop/file.txt");
    }

    public List<String> stringList(List<String> list) {
        List<String> listOfNumbers = new ArrayList<>();
        for (String result : list) {
            Integer integerNum = Integer.parseInt(result);
            if (integerNum % 3 == 0) {
                listOfNumbers.add("Fizz");
            } else if (integerNum % 5 == 0) {
                listOfNumbers.add("Buzz");
            } else if (integerNum % 3 == 0 && integerNum % 5 == 0) {
                listOfNumbers.add("FizzBuzz");
            } else {
                listOfNumbers.add(result);
            }
        }
        return listOfNumbers;
    }

    public List<String> readFileText(String fileName){
        List<String> resultList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            while (bufferedReader.ready()){
                resultList.add(bufferedReader.readLine());
            }
            return resultList;
        } catch (FileNotFoundException e){
            System.out.println("File not found!");
        } catch (IOException e){
            System.out.println("Invalid data entered");
        }
        return null;
    }

    public void fizzBuzzer(String fileName){
        List<String> result = stringList(readFileText(fileName));
        for (String value : result) {
            System.out.println(value);
        }
    }
}
