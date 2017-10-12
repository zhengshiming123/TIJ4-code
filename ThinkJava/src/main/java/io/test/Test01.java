package io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

/**
 * Created by h on 2017/10/10.
 * RandomAccessFile 插入写示例：
 */
public class Test01 {

    public static void main(String[] args) {
        beiju(2,"bbb","aa.txt");
    }

    /**
     *
     * @param skip 跳过多少过字节进行插入数据
     * @param str 要插入的字符串
     * @param fileName 文件路径
     */
    public static void beiju(long skip, String str, String fileName){
        try {
            RandomAccessFile raf = new RandomAccessFile(fileName,"rw");
            if(skip <  0 || skip > raf.length()){
                System.out.println("跳过字节数无效");
                return;
            }
            byte[] b = str.getBytes();
            raf.setLength(raf.length() + b.length);
            for(long i = raf.length() - 1; i > b.length + skip - 1; i--){
                raf.seek(i - b.length);
                byte temp = raf.readByte();
                raf.seek(i);
                raf.writeByte(temp);
            }
            raf.seek(skip);
            raf.write(b);
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 实现向指定位置
     * 插入数据
     * @param fileName 文件名
     * @param points 指针位置
     * @param insertContent 插入内容
     * **/
    public static void insert(String fileName,long points,String insertContent){
        try{
            File tmp= File.createTempFile("tmp", null);
            tmp.deleteOnExit();//在JVM退出时删除

            RandomAccessFile raf=new RandomAccessFile(fileName, "rw");
            //创建一个临时文件夹来保存插入点后的数据
            FileOutputStream tmpOut=new FileOutputStream(tmp);
            FileInputStream tmpIn=new FileInputStream(tmp);
            raf.seek(points);
            /**将插入点后的内容读入临时文件夹**/

            byte [] buff=new byte[1024];
            //用于保存临时读取的字节数
            int hasRead=0;
            //循环读取插入点后的内容
            while((hasRead=raf.read(buff))>0){
                // 将读取的数据写入临时文件中
                tmpOut.write(buff, 0, hasRead);
            }

            //插入需要指定添加的数据
            raf.seek(points);//返回原来的插入处
            //追加需要追加的内容
            raf.write(insertContent.getBytes());
            //最后追加临时文件中的内容
            while((hasRead=tmpIn.read(buff))>0){
                raf.write(buff,0,hasRead);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
