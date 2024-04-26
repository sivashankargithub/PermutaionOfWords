package rest10.otp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtpController {
	@GetMapping("/otp/{size}/{qty}")
	public List<String> getOtp(@PathVariable int size, @PathVariable int qty){
		List<String>list1=new ArrayList<>();
		Random random=new Random();
		for(int i=0;i<qty;i++) {
			int start = (int)Math.pow(10, size-1);
			int end = (int)Math.pow(10, size);
			int otp=random.nextInt(start,end);
			list1.add(String.valueOf(otp));
		}
		return list1;
	}
	
}
