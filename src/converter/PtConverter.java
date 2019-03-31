package converter;

import org.springframework.core.convert.converter.Converter;
import pojo.Pt;

/**
 * 点对象 自定义转换器
 */
public class PtConverter implements Converter<String, Pt>{

	@Override
	public Pt convert(String str) {
		Pt pt = new Pt();
		String[] arr = str.split(",");
		pt.setX(Integer.parseInt(arr[0]));
		pt.setY(Integer.parseInt(arr[1]));
		return pt;
	}

}
