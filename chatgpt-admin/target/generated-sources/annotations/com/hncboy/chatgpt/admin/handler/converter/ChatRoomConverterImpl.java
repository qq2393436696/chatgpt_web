package com.hncboy.chatgpt.admin.handler.converter;

import com.hncboy.chatgpt.admin.domain.vo.ChatRoomVO;
import com.hncboy.chatgpt.base.domain.entity.ChatRoomDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-28T11:47:23+0000",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 17.0.2 (Oracle Corporation)"
)
public class ChatRoomConverterImpl implements ChatRoomConverter {

    @Override
    public List<ChatRoomVO> entityToVO(List<ChatRoomDO> chatRoomDOList) {
        if ( chatRoomDOList == null ) {
            return null;
        }

        List<ChatRoomVO> list = new ArrayList<ChatRoomVO>( chatRoomDOList.size() );
        for ( ChatRoomDO chatRoomDO : chatRoomDOList ) {
            list.add( chatRoomDOToChatRoomVO( chatRoomDO ) );
        }

        return list;
    }

    protected ChatRoomVO chatRoomDOToChatRoomVO(ChatRoomDO chatRoomDO) {
        if ( chatRoomDO == null ) {
            return null;
        }

        ChatRoomVO chatRoomVO = new ChatRoomVO();

        chatRoomVO.setApiType( chatRoomDO.getApiType() );
        chatRoomVO.setConversationId( chatRoomDO.getConversationId() );
        chatRoomVO.setCreateTime( chatRoomDO.getCreateTime() );
        chatRoomVO.setFirstMessageId( chatRoomDO.getFirstMessageId() );
        chatRoomVO.setId( chatRoomDO.getId() );
        chatRoomVO.setIp( chatRoomDO.getIp() );
        chatRoomVO.setTitle( chatRoomDO.getTitle() );
        chatRoomVO.setUpdateTime( chatRoomDO.getUpdateTime() );

        return chatRoomVO;
    }
}
