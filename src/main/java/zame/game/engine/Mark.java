package zame.game.engine;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Mark implements Externalizable
{
	private static final long serialVersionUID = 0L;

	public int id;
	public int x;
	public int y;

	public void writeExternal(ObjectOutput os) throws IOException
	{
		os.writeInt(id);
		os.writeInt(x);
		os.writeInt(y);
	}

	public void readExternal(ObjectInput is) throws IOException
	{
		id = is.readInt();
		x = is.readInt();
		y = is.readInt();
	}
}
