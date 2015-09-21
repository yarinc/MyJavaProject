package io;

import java.io.IOException;
import java.io.InputStream;

/**
 * The Class MyDecompressorInputStream decompressing a file to a maze.
 */
public class MyDecompressorInputStream extends InputStream {

	private InputStream in;

	/**
	 * Instantiates a new MyDecompressorInputStream object.
	 * @param in the in
	 */
	public MyDecompressorInputStream(InputStream in) {
		this.in = in;
	}

	/* (non-Javadoc)
	 * @see java.io.InputStream#read()
	 */
	@Override
	public int read() throws IOException {
		return in.read();
	}
	
	/* (non-Javadoc)
	 * @see java.io.InputStream#read(byte[])
	 */
	public int read(byte[] b) throws IOException {
		int loop, counter, c, i=0;
		//While not at the end of the file.
		while ((c = in.read()) != -1) {
			//Read next byte.
			counter = in.read();
			//If byte is not '-1'.
			if(counter != -1){
				//Add to the array the number 'c', 'counter' times.
				for(loop = 0 ;loop < counter ;loop++) {
					b[i] = (byte) c;
					i++;
				}
			}
		}
		return 0; 
	}
}
