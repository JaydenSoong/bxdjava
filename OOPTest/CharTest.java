/*
 * 练习2:
 *       在一个类中编写一个方法，这个方法搜索一个字符数组中是否存在某个字符，如果存在，则返回这个字符在
 *       字符数组中第一次出现的位置（序号从 0 开始），否则，返回 -1。要搜索的字符数组和字符都以参数传递
 *       给该方法，如果传入的数组为 null, 应抛出IllegalArgumentException 异常。
 *       
 *       在类的 main 方法中以各种可能出现的情况测试试验该方法编写得是否正确。
 *       例如，字符不存在，字符存在，传入的数组为 null 等。
 *
 */


public class CharTest {
    
    public static int searchChar(char[] chs, char key) {
        
        if(chs == null)
            throw new IllegalArgumentException("数组为空");
        
        for(int i=0; i<chs.length; i++) {
            if (chs[i] == key)
                return i;
        }

        return -1;
    }

    public static void main (String[] args) {
        char[] chs = {'a', 'b', 'e', 'k'};
        //chs = null;
        int key = searchChar(chs, 'f');
        System.out.println(key);
    }
}
