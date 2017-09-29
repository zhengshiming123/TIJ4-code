class Car{
    public void run(){System.out.println("我每小时跑100公里");}
}
class FlyCar extends Car{
    public void run(){System.out.println("我每小时跑200公里");}
    public void fly(){System.out.println("我每小时飞500公里");}
    public static void main(String args[]){
        Car car1=new Car();
        Car car2=new FlyCar();
        car1.run();//这里 会输出我每小时跑100公里
        car2.run();//这里 会输出我每小时跑200公里
//        car2.fly();//这句话错，不能执行
    } 
}