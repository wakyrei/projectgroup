public class test {
    public static void main(String[] args) {
        String format = String.format("redirect:%s#!/%s", "11/", "22");
        System.out.println(format);
        UriBuilder.fromUri("http://baidu.com/")

                .queryParam("agentno", "1111111")
                .build()
                .toString();
    }
}
