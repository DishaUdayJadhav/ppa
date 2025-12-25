package com.marvellous.MarvellousPortal.Repositary;

import com.marvellous.MarvellousPortal.Entity.BatchEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepositary extends MongoRepository<BatchEntry, ObjectId>
{



}
