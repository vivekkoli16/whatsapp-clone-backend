package com.app.service;

import java.util.List;

import com.app.exception.ChatException;
import com.app.exception.UserException;
import com.app.modal.Chat;
import com.app.modal.User;

public interface ChatService {
	
	public Chat createChat(User reqUser, Integer userId2)throws UserException ;
	
	public Chat findChatById(Integer chatId) throws ChatException;

	public List<Chat> findAllChatByUserId(Integer userId) throws UserException;

	public Chat createGroup(GroupChatRequest req, User reqUser) throws UserException;

	public Chat addUserToGroup(Integer userId, Integer chatId, User reqUser) throws UserException, ChatException;

	public Chat renameGroup(Integer chatId, String groupName, User reqUser) throws ChatException, UserException;

	public Chat removeFromGroup(Integer chatId, Integer userId, User reqUser) throws UserException, ChatException;

	public void deleteChat(Integer chatId, Integer userId) throws ChatException, UserException;

}
