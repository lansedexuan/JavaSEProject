package _09File;

import java.io.File;

public class _2FileSearch {
    public static void main(String[] args) {
        try {
            File dir = new File("D:/");
            searchFile(dir, "QQ.exe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void searchFile(File dir,String fileName) throws Exception{
        //1 判断极端情况
        if(dir==null||!dir.exists()||dir.isFile()){
            return;//不搜索
        }

        //2 获取目录下的所有一级文件或者文件夹对象
        File[] files=dir.listFiles();

        //3 判断当前目录下是否存在一级文件对象，存在才可以遍历
        if(files!=null&&files.length>0){//避免空指针异常
            for (File file:files){
                if(file.isFile()){//判断是否是文件
                    if(file.getName().contains(fileName)){//模糊查询 不用equals()
                        System.out.println("找到目标文件："+file.getAbsolutePath());
                        Runtime r = Runtime.getRuntime();//虚拟机对象
                        r.exec(file.getAbsolutePath());
                    }
                }else{//文件夹
                    searchFile(file,fileName);
                }
            }
        }
    }
}
