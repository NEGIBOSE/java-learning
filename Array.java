public class Array {
    public static void main(String[] args){
        int[] score = new int[3];
        score[0] = 80;
        score[1] = 100;
        score[2] = 75;
        
        String[] name = {"菅原", "村山", "寺島"};
        
        System.out.println(name[0] + "さん :" + score[0] + "点");
        System.out.println(name[1] + "さん :" + score[0] + "点");
        System.out.println(name[2] + "さん :" + score[0] + "点");
        System.out.println("受験者数" + score.length + "名");
      }
}
