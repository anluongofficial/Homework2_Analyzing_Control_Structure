public class Main {
    public static void main(String[] args) {
        int result = 0, x = 5, y = -7, M ;
        if (y<0)
        {
            y = -y;
            M = -1;
        }
        else
            M = 1;
        while (y>0){
            if (y%2 == 0)
            {
                x = x+x;
                y = y / 2;
            }
            else
            {
                result = result + x;
                y = y -1;
            }
        }
        if (M<0)
            result = -result;
        System.out.println(result);
        // The purpose of this program is to find the multiplication of x*y
        // @copyright, 2023 anluongofficial. 
    }
}