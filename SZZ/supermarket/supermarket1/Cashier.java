package supermarket1;

import java.util.Scanner;

public class Cashier {
          public  void  cashier() {
        	  int thirdNum=0;
        	  boolean fla=true; 
        	  Scanner reader=new Scanner(System.in);
        String	 username1="szz";
        String   password1="cmy520";
        String username=null,password=null;
      		boolean flag = true;
    		do {
    		   System.out.println("请输入用户名：");
    		   username=reader.next();
    		   System.out.println("请输入密码：");
    		   password = reader.next();
    			   if(username.equals(username1)&& password.equals(password1)) {
    			     System.out.println("登录成功。"); 
    			     flag = false;
    			   }else {
    			     System.out.println("用户名或密码输入错误，请重新输入。");
    			   }
    			        
    	}while(flag);

      				
             do {
            	 fla=false;
            	 System.out.println("欢迎进入收银员系统！");
            	 System.out.println("\t.1查找商品：");
            	 System.out.println("\t.2购买商品：");
            	 System.out.println("\t.3输出所购商品信息：");
            	 System.out.println("\t.4活动期间打折介绍：");
            	 System.out.println("\t.5注册会员：");
            	 System.out.println("\t.6会员查询：");
            	 System.out.println("\t.7会员结账：");
            	 System.out.println("\t.8退出收银员系统，返回主页");
            	 System.out.println("请输入指令：");
            	 
            	  thirdNum =  reader.nextInt();
            	switch(thirdNum) {
            	case 1:
            		Shopping shopping = new Shopping();
            		shopping.printThis();
            		break;
            	case 2:
            		
            		break;
            	case 3:
            		
            		break;
            	case 4:
            		Festivalscost fe=new Festivalscost();
            		fe.festivalscost();
            		
            		break;
            	case 5:
            		Registration re=new Registration();
            		re.regitration();
            		break;
            	case 6:
            		
            		break;
                case 7:
            		
            		break;
            	case 8:
            		System.out.println("已退出收银员系统");
            		break;
            		default:
					System.out.println("请输入1-8之间的数");
					fla=true;
            	}
             }while(thirdNum!=8&&fla==true);
            	 
            	 
            	 
             }
          }

