package name.qd.techAnalyst.dataSource;

import java.util.Date;
import java.util.List;
import java.util.Map;

import name.qd.techAnalyst.vo.BuySellInfo;
import name.qd.techAnalyst.vo.DailyClosingInfo;
import name.qd.techAnalyst.vo.ProductClosingInfo;

public interface DataSource {
	public List<ProductClosingInfo> getProductClosingInfo(String product, Date from, Date to) throws Exception;
	public List<DailyClosingInfo> getDailyClosingInfo(Date from, Date to) throws Exception;
	public Map<Date, List<ProductClosingInfo>> getAllProductClosingInfo(Date from, Date to) throws Exception;
	public List<BuySellInfo> getBuySellInfo(Date date, String product) throws Exception;
}
