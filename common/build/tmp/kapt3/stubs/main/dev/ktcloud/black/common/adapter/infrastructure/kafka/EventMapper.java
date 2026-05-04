package dev.ktcloud.black.common.adapter.infrastructure.kafka;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0016J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016\u00a8\u0006\f\u00c0\u0006\u0003"}, d2 = {"Ldev/ktcloud/black/common/adapter/infrastructure/kafka/EventMapper;", "Message", "Event", "", "toMessage", "event", "(Ljava/lang/Object;)Ljava/lang/Object;", "toEvent", "message", "", "events", "messages", "common"})
public abstract interface EventMapper<Message extends java.lang.Object, Event extends java.lang.Object> {
    
    public abstract Message toMessage(Event event);
    
    public abstract Event toEvent(Message message);
    
    @org.jetbrains.annotations.NotNull()
    public default java.util.List<Message> toMessage(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends Event> events) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public default java.util.List<Event> toEvent(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends Message> messages) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Deprecated()
        public static <Message extends java.lang.Object, Event extends java.lang.Object>java.util.List<Message> toMessage(@org.jetbrains.annotations.NotNull()
        dev.ktcloud.black.common.adapter.infrastructure.kafka.EventMapper<Message, Event> $this, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends Event> events) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Deprecated()
        public static <Message extends java.lang.Object, Event extends java.lang.Object>java.util.List<Event> toEvent(@org.jetbrains.annotations.NotNull()
        dev.ktcloud.black.common.adapter.infrastructure.kafka.EventMapper<Message, Event> $this, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends Message> messages) {
            return null;
        }
    }
}