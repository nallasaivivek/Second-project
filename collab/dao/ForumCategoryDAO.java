package com.collab.dao;

import java.util.List;

public interface ForumCategoryDAO {
	
	public List<com.collab.model.ForumCategory> getAllForumCategory();
	
	public boolean forumCategoryUpdate(com.collab.model.ForumCategory forumcategory);
		
	public com.collab.model.ForumCategory getForumCategoryByID(int fcid);

}
