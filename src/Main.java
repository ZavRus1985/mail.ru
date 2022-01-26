

public class Main {

    public static void main(String[] args) {

        String site = "www.mail.ru?param1=value1&param2=value2&param3=value3";
        String[] data = site.split("\\?");
        // for (String word : data) {
        //     System.out.println(word);
        //  }
        String a = data[1];
        String[] data1 = a.split("&");
        for (String word : data1)
            System.out.print(word.substring(7) + " ");

    }
}
