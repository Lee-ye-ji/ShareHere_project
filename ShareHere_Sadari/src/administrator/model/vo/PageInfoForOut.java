package administrator.model.vo;

public class PageInfoForOut {
	private int currentPage;
	private int listCount;
	private int pageLimit;
	private int omLimit;
	private int maxPage;
	private int startPage;
	private int endPage;

	public PageInfoForOut() {}
	
	// 페이징처리 계산에 필요한 값을 받아 start, end, maxPage 계산하여 세팅
		public PageInfoForOut(int currentPage, int listCount, int pageLimit, int omLimit) {
			super();
			this.currentPage = currentPage;
			this.listCount = listCount;
			this.pageLimit = pageLimit;
			this.omLimit = omLimit;
			
			this.maxPage = (int)Math.ceil((double) listCount / omLimit);
			this.startPage = (currentPage - 1) / pageLimit * pageLimit + 1;
			this.endPage = startPage + pageLimit - 1;
			
			if(this.maxPage < this.endPage) {
				this.endPage = this.maxPage;
			}
		}

		public PageInfoForOut(int currentPage, int listCount, int pageLimit, int omLimit, int maxPage, int startPage,
				int endPage) {
			super();
			this.currentPage = currentPage;
			this.listCount = listCount;
			this.pageLimit = pageLimit;
			this.omLimit = omLimit;
			this.maxPage = maxPage;
			this.startPage = startPage;
			this.endPage = endPage;
		}

		public int getCurrentPage() {
			return currentPage;
		}

		public void setCurrentPage(int currentPage) {
			this.currentPage = currentPage;
		}

		public int getListCount() {
			return listCount;
		}

		public void setListCount(int listCount) {
			this.listCount = listCount;
		}

		public int getPageLimit() {
			return pageLimit;
		}

		public void setPageLimit(int pageLimit) {
			this.pageLimit = pageLimit;
		}

		public int getOmLimit() {
			return omLimit;
		}

		public void setOLimit(int omLimit) {
			this.omLimit = omLimit;
		}

		public int getMaxPage() {
			return maxPage;
		}

		public void setMaxPage(int maxPage) {
			this.maxPage = maxPage;
		}

		public int getStartPage() {
			return startPage;
		}

		public void setStartPage(int startPage) {
			this.startPage = startPage;
		}

		public int getEndPage() {
			return endPage;
		}

		public void setEndPage(int endPage) {
			this.endPage = endPage;
		}

		@Override
		public String toString() {
			return "PageInfo [currentPage=" + currentPage + ", listCount=" + listCount + ", pageLimit=" + pageLimit
					+ ", omLimit=" + omLimit + ", maxPage=" + maxPage + ", startPage=" + startPage + ", endPage="
					+ endPage + "]";
		}
		
		
	}

