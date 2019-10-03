package com.luciad.imageio.webp;

import javax.imageio.stream.IIOByteBuffer;
import javax.imageio.stream.ImageOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;

public class WebPOutputStream implements ImageOutputStream {
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    public byte[] readBytes () throws IOException {
        return outputStream.toByteArray ();
    }

    @Override
    public void write (int b) throws IOException {

    }

    @Override
    public void write (byte[] b) throws IOException {
        outputStream.write (b);
    }

    @Override
    public void write (byte[] b , int off , int len) throws IOException {
        outputStream.write (b, off, len);
    }

    @Override
    public void writeBoolean (boolean v) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void writeByte (int v) throws IOException {
        outputStream.write (v);
    }

    @Override
    public void writeShort (int v) throws IOException {
        outputStream.write (v);
    }

    @Override
    public void writeChar (int v) throws IOException {
        outputStream.write (v);
    }

    @Override
    public void writeInt (int v) throws IOException {
        outputStream.write (v);

    }

    @Override
    public void writeLong (long v) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void writeFloat (float v) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void writeDouble (double v) throws IOException {
        throw new UnsupportedOperationException ();

    }

    @Override
    public void writeBytes (String s) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void writeChars (String s) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void writeUTF (String s) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void writeShorts (short[] s , int off , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void writeChars (char[] c , int off , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void writeInts (int[] i , int off , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void writeLongs (long[] l , int off , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void writeFloats (float[] f , int off , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void writeDoubles (double[] d , int off , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void writeBit (int bit) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void writeBits (long bits , int numBits) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void setByteOrder (ByteOrder byteOrder) {
        throw new UnsupportedOperationException ();
    }

    @Override
    public ByteOrder getByteOrder () {
        throw new UnsupportedOperationException ();
    }

    @Override
    public int read () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public int read (byte[] b) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public int read (byte[] b , int off , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void readBytes (IIOByteBuffer buf , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public boolean readBoolean () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public byte readByte () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public int readUnsignedByte () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public short readShort () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public int readUnsignedShort () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public char readChar () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public int readInt () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public long readUnsignedInt () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public long readLong () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public float readFloat () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public double readDouble () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public String readLine () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public String readUTF () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void readFully (byte[] b , int off , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void readFully (byte[] b) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void readFully (short[] s , int off , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void readFully (char[] c , int off , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void readFully (int[] i , int off , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void readFully (long[] l , int off , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void readFully (float[] f , int off , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void readFully (double[] d , int off , int len) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public long getStreamPosition () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public int getBitOffset () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void setBitOffset (int bitOffset) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public int readBit () throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public long readBits (int numBits) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public long length () throws IOException {
        return outputStream.size ();
    }

    @Override
    public int skipBytes (int n) throws IOException {
         throw new UnsupportedOperationException ();
    }

    @Override
    public long skipBytes (long n) throws IOException {
         throw new UnsupportedOperationException ();
    }

    @Override
    public void seek (long pos) throws IOException {
         throw new UnsupportedOperationException ();
    }

    @Override
    public void mark () {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void reset () throws IOException {
        outputStream.reset ();
    }

    @Override
    public void flushBefore (long pos) throws IOException {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void flush () throws IOException {
        outputStream.flush ();
    }

    @Override
    public long getFlushedPosition () {
        throw new UnsupportedOperationException ();
    }

    @Override
    public boolean isCached () {
        throw new UnsupportedOperationException ();
    }

    @Override
    public boolean isCachedMemory () {
        throw new UnsupportedOperationException ();
    }

    @Override
    public boolean isCachedFile () {
        throw new UnsupportedOperationException ();
    }

    @Override
    public void close () throws IOException {
        outputStream.close ();
    }
}
