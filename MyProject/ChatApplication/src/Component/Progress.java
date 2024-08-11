	package Component;
	
import javax.swing.JProgressBar;
	
	import ExternalClass.ProgressCircleUI;
	
	public class Progress  extends JProgressBar{
		private static final long serialVersionUID = 1L;
		private ProgressType progressType = ProgressType.NONE ;
		
		
		public Progress() {
			super();
			setOpaque(false);
			setUI(new ProgressCircleUI(this));
		}
		
		
		public static enum ProgressType {
			NONE ,DONW_FILE, CANCEL, FILE
		}


		public ProgressType getProgressType() {
			return progressType;
		}


		public void setProgressType(ProgressType progressType) {
			this.progressType = progressType;
			repaint();
		}
		
		
	}
