public class _01array {
    /*
        1 数组转集合
            1.1 遍历
            for (ele : array) {
                list.add(ele);
            }

            1.2 Array.asList() 数组一定要是引用型
                String[] array = {"Java", "Python"};
                List<String> list = Arrays.asList(array);

        2 集合转数组 list.toArray()
        Object[] array = list.toArray();//不推荐
        String[] array = list.toArray(new String[0]);
     */
    public static void main(String[] args) {
        //静态初始化数组
        int[] arr={1,2,3,4,5};
        //完整格式
        int[] arr1=new int[]{1,2,3,4,5};

        //动态初始化数组
        int[] arr2=new int[5];
        /*
         * 基本类型
         *   byte short char int long 0
         *   float double 0.0
         *   boolean false
         * 引用类型
         *   类、接口、数组、string null
         * */

        //二维数组
        String [][] arr3={{"1","2"},{"3","4"}};
        String [][] arr4=new String[2][2];

        //数组长度
        System.out.println(arr.length);
        System.out.println(arr1);//地址
    }
}
