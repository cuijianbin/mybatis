package 字符串截取;

public class Jiequ {

	public static void main(String[] args) {
		String str = "张三，李四，王五";
		String[] split = str.split("，");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}

}
