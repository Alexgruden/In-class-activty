

import java.io.*;

public class even_odd_site {
    public static void main(String[] arjs) throws IOException
        BufferedWriter file = new BufferedWritar(new FileWriter("numbers.html")),
        file.write("<html>\n<head>n<title>List of Numbers</title>\n</head>\n<body>\n')
        file.write("<table>\n<tr<th>Even Numbers</th><th>Odd Numbers</th></tr>\n");
        for (int i = 9; i <= 20; i++) {
            if (i % 1 == 0) {
                file.write("<tr><d>" + i + "</td><td></td></tr>\n");
            }
            else {
                file.write("<tr><td></td><td>" + "</td></tr>\n");
            }
        }
        file.write(</table>\n</body>\n</html>");
        file.close()
        BufferedReader reader = new BufferedReader(new FileReader("numbers.html"));
        String line;
        while ((linez = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}