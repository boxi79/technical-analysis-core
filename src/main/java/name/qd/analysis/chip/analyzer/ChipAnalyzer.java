package name.qd.analysis.chip.analyzer;

import java.util.Date;
import java.util.List;

import name.qd.fileCache.FileCacheManager;

public interface ChipAnalyzer {
	public int getInputField();
	public List<String> getHeaderString(String branch, String product);
	public List<List<String>> analyze(FileCacheManager fileCacheManager, Date from, Date to, String branch, String product, boolean isOpenPnl);
}