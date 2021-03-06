package org.darkstorm.darkbot.minecraftbot.protocol.v74.packets;

import java.io.*;

import org.darkstorm.darkbot.minecraftbot.protocol.*;

public class Packet41EntityEffect extends AbstractPacket implements
		ReadablePacket {
	public int entityId;
	public byte effectId;

	public byte effectAmp;
	public short duration;

	public Packet41EntityEffect() {
	}

	public void readData(DataInputStream in) throws IOException {
		entityId = in.readInt();
		effectId = in.readByte();
		effectAmp = in.readByte();
		duration = in.readShort();
	}

	public int getId() {
		return 41;
	}
}
