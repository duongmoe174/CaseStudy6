package com.duong.casemodule6.service.comment;

import com.duong.casemodule6.entity.comment.Comment;
import com.duong.casemodule6.service.IGerneralService;

public interface ICommentService extends IGerneralService<Comment> {

    Iterable<Comment> get3CommentByHouseId(Long id);

    Iterable<Comment> getAllCommentByHouseId(Long id);

}
