package io;

import java.io.IOException;
import java.io.OutputStream;

/**
 * The Class MyCompressorOutputStream compressing a maze to file.
 */
public class MyCompressorOutputStream extends OutputStream {
	
	/** The out. */
	private OutputStream out;
	
	/**
	 * Instantiates a new MyCompressorOutputStream object.
	 * @param out the out
	 */
	public MyCompressorOutputStream(OutputStream out) {
		this.out = out;
	}

	/* (non-Javadoc)
	 * @see java.io.OutputStream#write(int)
	 */
	@Override
	public void write(int b) throws IOException {
		out.write(b);
	}
	
	/* (non-Javadoc)
	 * @see java.io.OutputStream#write(byte[])
	 */
	public void write(byte[] b) throws IOException {
		int i, counter = 1;
		//For each cell at the array
		for(i = 1; i<b.length;i++) {
			//If not equal to the one before
			if(b[i-1] != b[i]) { 
				//write the cell data and number of times showed.
				out.write(b[i-1]);
				out.write(counter);
				//reset counter.
				counter = 1;
			}
			//If the cell equal the the one before.
			else
				//raise counter.
				counter++;
			//If the program reached to the last cell
			if(i == (b.length - 1)) {
				//write the cell and number of times showed.
				out.write(b[i]);
				out.write(counter);
			}
		}
	}

}
