package com.hncboy.chatgpt.admin.handler.converter;

import com.hncboy.chatgpt.admin.domain.vo.ChatMessageVO;
import com.hncboy.chatgpt.base.domain.entity.ChatMessageDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-28T11:47:22+0000",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 17.0.2 (Oracle Corporation)"
)
public class ChatMessageConverterImpl implements ChatMessageConverter {

    @Override
    public List<ChatMessageVO> entityToVO(List<ChatMessageDO> chatMessageDOList) {
        if ( chatMessageDOList == null ) {
            return null;
        }

        List<ChatMessageVO> list = new ArrayList<ChatMessageVO>( chatMessageDOList.size() );
        for ( ChatMessageDO chatMessageDO : chatMessageDOList ) {
            list.add( chatMessageDOToChatMessageVO( chatMessageDO ) );
        }

        return list;
    }

    protected ChatMessageVO chatMessageDOToChatMessageVO(ChatMessageDO chatMessageDO) {
        if ( chatMessageDO == null ) {
            return null;
        }

        ChatMessageVO chatMessageVO = new ChatMessageVO();

        chatMessageVO.setApiType( chatMessageDO.getApiType() );
        chatMessageVO.setChatRoomId( chatMessageDO.getChatRoomId() );
        if ( chatMessageDO.getCompletionTokens() != null ) {
            chatMessageVO.setCompletionTokens( chatMessageDO.getCompletionTokens().longValue() );
        }
        chatMessageVO.setContent( chatMessageDO.getContent() );
        chatMessageVO.setContextCount( chatMessageDO.getContextCount() );
        chatMessageVO.setConversationId( chatMessageDO.getConversationId() );
        chatMessageVO.setCreateTime( chatMessageDO.getCreateTime() );
        chatMessageVO.setIp( chatMessageDO.getIp() );
        chatMessageVO.setMessageId( chatMessageDO.getMessageId() );
        chatMessageVO.setMessageType( chatMessageDO.getMessageType() );
        chatMessageVO.setParentAnswerMessageId( chatMessageDO.getParentAnswerMessageId() );
        chatMessageVO.setParentMessageId( chatMessageDO.getParentMessageId() );
        chatMessageVO.setParentQuestionMessageId( chatMessageDO.getParentQuestionMessageId() );
        if ( chatMessageDO.getPromptTokens() != null ) {
            chatMessageVO.setPromptTokens( chatMessageDO.getPromptTokens().longValue() );
        }
        chatMessageVO.setQuestionContextCount( chatMessageDO.getQuestionContextCount() );
        chatMessageVO.setResponseErrorData( chatMessageDO.getResponseErrorData() );
        chatMessageVO.setStatus( chatMessageDO.getStatus() );
        if ( chatMessageDO.getTotalTokens() != null ) {
            chatMessageVO.setTotalTokens( chatMessageDO.getTotalTokens().longValue() );
        }
        chatMessageVO.setUpdateTime( chatMessageDO.getUpdateTime() );

        return chatMessageVO;
    }
}
