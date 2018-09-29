import java.io.*;


public class Solution {

    public static void main(String[] args) throws IOException {

        File file = new File("G:\\Startup\\CodeBrink\\ExtraSoftwares\\HTML_IN.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        StringBuilder inputBuilder = new StringBuilder();
        while ((st = br.readLine()) != null)
            inputBuilder.append(st);

        String input = inputBuilder.toString();

        input = removeParaAddBreak(input);

        giveOutputFile(input);
    }

    private static String removeParaAddBreak(String input) {

        input = input.replaceAll("<p>","");
        input = input.replaceAll("</p>","<br>");
        return input;
    }

    private static void giveOutputFile(String input) throws IOException {
        File file = new File("G:\\Startup\\CodeBrink\\ExtraSoftwares\\HTML_OUT.txt");

        //Create the file
        if (file.createNewFile())
        {
            System.out.println("File is created!");
        } else {
            System.out.println("File already exists.");
        }

        //Write Content
        FileWriter writer = new FileWriter(file);
        writer.write(input);
        writer.close();
    }

}
