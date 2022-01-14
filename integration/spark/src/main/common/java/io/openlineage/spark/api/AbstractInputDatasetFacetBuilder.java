package io.openlineage.spark.api;

import io.openlineage.client.OpenLineage;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * {@link CustomFacetBuilder} that generates {@link
 * io.openlineage.client.OpenLineage.InputDatasetFacet}s from input events.
 *
 * @see io.openlineage.spark.agent.OpenLineageEventHandler for a list of event types that may be
 *     passed to this builder.
 * @param <T>
 */
@RequiredArgsConstructor
public abstract class AbstractInputDatasetFacetBuilder<T>
    extends CustomFacetBuilder<T, OpenLineage.InputDatasetFacet> {
  @NonNull protected final OpenLineageContext context;
}