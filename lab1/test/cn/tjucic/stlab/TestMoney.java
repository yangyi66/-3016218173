package cn.tjucic.stlab;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import cn.tjucic.stlab.Money;

public class TestMoney {
	Money mon;
	@Before
	public void setup() {
		mon=new Money();
	}
	@Test
	public void testTakeout() {
		
		int [] res2= {0,1,2,0};
		for(int i=0;i<4;i++) {
		assertEquals(res2[i],mon.takeout(30)[i]);
		}
		
		assertEquals(null,mon.takeout(100));
		
	}
}
/*int [] res= {1,1,1,1};
for(int i=0;i<4;i++) {
assertEquals(res[i],mon.takeout(76)[i]);
}

int [] res1= {1,1,0,0};
for(int i=0;i<4;i++) {
assertEquals(res1[i],mon.takeout(70)[i]);
}*/