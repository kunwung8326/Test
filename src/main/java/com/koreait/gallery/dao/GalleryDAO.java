package com.koreait.gallery.dao;

import com.koreait.gallery.dto.GalleryMember;

public interface GalleryDAO {
	public int join(GalleryMember member);
	public GalleryMember login(GalleryMember member);
	public int leave(long no);
	
}
