package guxiangfly;

import org.apache.flink.api.common.JobID;
import org.apache.flink.api.common.state.ValueStateDescriptor;
import org.apache.flink.api.common.typeutils.base.StringSerializer;
import org.apache.flink.api.common.typeutils.base.VoidSerializer;
import org.apache.flink.contrib.streaming.state.RocksDBStateBackend;
import org.apache.flink.core.fs.CloseableRegistry;
import org.apache.flink.metrics.groups.UnregisteredMetricsGroup;
import org.apache.flink.runtime.checkpoint.CheckpointOptions;
import org.apache.flink.runtime.concurrent.FutureUtils;
import org.apache.flink.runtime.state.AbstractKeyedStateBackend;
import org.apache.flink.runtime.state.KeyGroupRange;
import org.apache.flink.runtime.state.KeyedStateHandle;
import org.apache.flink.runtime.state.SnapshotResult;
import org.apache.flink.runtime.state.StateBackend;
import org.apache.flink.runtime.state.memory.MemoryStateBackend;
import org.apache.flink.runtime.state.ttl.TtlTimeProvider;
import org.apache.flink.util.IOUtils;

import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;

/**
 * @Author guxiang02
 * @Date 2021/6/30
 **/
public class BadCaseTest {
//    public static void main(String[] args) {
//        long checkpointId = 1L;
//        long timestamp = 42L;
//
//        MockEnvironment env = MockEnvironment.builder().build();
//
//        final IOException testException = new IOException("Test exception");
//        CheckpointStateOutputStream outputStream = spy(new FailingStream(testException));
//
//        RocksDBStateBackend backend =
//                new RocksDBStateBackend((StateBackend) new MemoryStateBackend());
//
//        backend.setDbStoragePath(temporaryFolder.newFolder().toURI().toString());
//
//        AbstractKeyedStateBackend<Void> keyedStateBackend =
//                backend.createKeyedStateBackend(
//                        env,
//                        new JobID(),
//                        "test operator",
//                        VoidSerializer.INSTANCE,
//                        1,
//                        new KeyGroupRange(0, 0),
//                        null,
//                        TtlTimeProvider.DEFAULT,
//                        new UnregisteredMetricsGroup(),
//                        Collections.emptyList(),
//                        new CloseableRegistry());
//
//        try {
//            // register a state so that the state backend has to checkpoint something
//            keyedStateBackend.getPartitionedState(
//                    "namespace",
//                    StringSerializer.INSTANCE,
//                    new ValueStateDescriptor<>("foobar", String.class));
//
//            RunnableFuture<SnapshotResult<KeyedStateHandle>> snapshotFuture =
//                    keyedStateBackend.snapshot(
//                            checkpointId,
//                            timestamp,
//                            new TestCheckpointStreamFactory(() -> outputStream),
//                            CheckpointOptions.forCheckpointWithDefaultLocation());
//
//            try {
//                FutureUtils.runIfNotDoneAndGet(snapshotFuture);
//                fail("Expected an exception to be thrown here.");
//            } catch (ExecutionException e) {
//                Assert.assertEquals(testException, e.getCause());
//            }
//
//            verify(outputStream).close();
//        } finally {
//            IOUtils.closeQuietly(keyedStateBackend);
//            keyedStateBackend.dispose();
//            IOUtils.closeQuietly(env);
//        }
//    }
}
