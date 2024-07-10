 package com.Laptop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Laptop.entity.Laptop;

public interface LaptopRepository extends JpaRepository <Laptop,Integer> {
	   @Query(value="select *from laptop_list where name =?",nativeQuery=true)
	   public List<Laptop> getThis(String a);

	   @Query(value="select *from laptop_list where price<60000",nativeQuery=true)
	   public List<Laptop> getprice();
	    
	   @Query(value="select * from laptop_list where screensize>? && screensize<? ",nativeQuery=true)
	   public List<Laptop> getsize(float a,float b);
	   
	   @Query(value="select * from laptop_list where length(name)<=?",nativeQuery=true)
	   public List<Laptop>getname(int a);
	   
	   @Query(value="select * from laptop_list where name=?",nativeQuery=true)
	   public List<Laptop>getname(String a);

	   @Query(value="select *from laptop_list where ram= '100Gb'",nativeQuery=true)
	   public List<Laptop> getram();
	   
	   @Query(value="select * from laptop_list order by price",nativeQuery=true)
	   public List<Laptop> getorder();
	   
	   @Query(value="select min(price) from laptop_list",nativeQuery=true)
	   public int getmin();
	   
	   @Query(value="select * from laptop_list where price=(select max(price) from laptop_list)",nativeQuery=true)
	   public List<Laptop> getmax();
	   
	   @Query (value="select id,company,name from laptop_list",nativeQuery=true)
		public List<Object> getobject();
	   
	   @Query(value="select * from laptop_list where name=?",nativeQuery=true)
	   public List<Laptop>getxname(String a);
	   
	   //jquery
	   
	   @Query(value="select lap from Laptop lap where lap.price>:p")
	   public List<Laptop> getp(@Param ("p")int p);
	   
	   @Query(value="select b from Laptop b where b.screensize>:x and b.screensize<:y")
	   public List<Laptop> getjr(@Param("x")float x,@Param("y")float y);
	   
	   @Query(value="select max(q.price) from Laptop q")
	   public List<Laptop> getmp();
	   
	   @Query(value = "select md from Laptop md where md.price = (select min(md.price) from Laptop md)")
		public List<Laptop> getmn();
	}



