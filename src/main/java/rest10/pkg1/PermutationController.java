package rest10.pkg1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PermutationController {
	@GetMapping("/perm3/{word3}")
	public List<String> getPerm3(@PathVariable String word3){
		List<String>list1=new ArrayList<>();
		String s1,s2,s3;
		s1=word3.substring(0,1);  //c
		s2=word3.substring(1,2);  //a
		s3=word3.substring(2,3);  //p
		list1.add(s1+s2+s3);
		list1.add(s1+s3+s2);
		list1.add(s2+s1+s3);
		list1.add(s2+s3+s1);
		list1.add(s3+s1+s2);
		list1.add(s3+s2+s1);
		return list1;
	}
	
//	@GetMapping("/perm4/{word4}")
//	public List<String> getPerm4(@PathVariable String word4){
//		List<String>list3=new ArrayList<>();
//		List<String>list4=new ArrayList<>();
//		String c1,c2,c3,c4,p1,p2;
//		c1=word4.substring(0,1);
//		c2=word4.substring(1,2);
//		p1=word4.substring(0,3);
//		p2=word4.substring(3,4);
//		list3=getPerm3(s1);
//		for(int i=0;i<list3.size();i++) {
//			list4.add(list3.get(i)+s2);
//			list4.add(s2+list3.get(i));
//		}
//		s1=word4.substring(1,4);
//		s2=word4.substring(0,1);
//		list3=getPerm3(s1);
//		for(int i=0;i<list3.size();i++) {
//			list4.add(list3.get(i)+s2);
//			list4.add(s2+list3.get(i));
//		}
//		return list4;
//	}
//	
//	@GetMapping("/perm5/{word5}")
//	public List<String> getPerm5(@PathVariable String word5){
//		List<String>list4=new ArrayList<>();
//		List<String>list5=new ArrayList<>();
//		String s1,s2,c1,c2,c3,c4;
//		s1=word5.substring(0,4);
//		s2=word5.substring(4,5);
//		list4=getPerm4(s1);
//		for(int i=0;i<list4.size();i++) {
//			list4.add(list4.get(i)+s2);
//			list4.add(s2+list4.get(i));
//		}
//		s1=word5.substring(1,5);
//		s2=word5.substring(0,1);
//		list4=getPerm4(s1);
//		for(int i=0;i<list4.size();i++) {
//			list4.add(list4.get(i)+s2);
//			list4.add(s2+list4.get(i));
//		}
//		return list5;
//	}
	
}
