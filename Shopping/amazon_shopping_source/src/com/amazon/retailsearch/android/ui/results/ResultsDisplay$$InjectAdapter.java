// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.retailsearch.android.ui.results;

import com.amazon.retailsearch.interaction.UserInteractionListener;
import com.amazon.retailsearch.metrics.SearchMetricsListenerInvoker;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.amazon.retailsearch.android.ui.results:
//            ResultsDisplay

public final class  extends Binding
    implements MembersInjector
{

    private Binding searchMetricsListenerInvoker;
    private Binding userInteractionListener;

    public void attach(Linker linker)
    {
        userInteractionListener = linker.requestBinding("com.amazon.retailsearch.interaction.UserInteractionListener", com/amazon/retailsearch/android/ui/results/ResultsDisplay, getClass().getClassLoader());
        searchMetricsListenerInvoker = linker.requestBinding("com.amazon.retailsearch.metrics.SearchMetricsListenerInvoker", com/amazon/retailsearch/android/ui/results/ResultsDisplay, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userInteractionListener);
        set1.add(searchMetricsListenerInvoker);
    }

    public void injectMembers(ResultsDisplay resultsdisplay)
    {
        resultsdisplay.userInteractionListener = (UserInteractionListener)userInteractionListener.get();
        resultsdisplay.searchMetricsListenerInvoker = (SearchMetricsListenerInvoker)searchMetricsListenerInvoker.get();
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ResultsDisplay)obj);
    }

    public ()
    {
        super(null, "members/com.amazon.retailsearch.android.ui.results.ResultsDisplay", false, com/amazon/retailsearch/android/ui/results/ResultsDisplay);
    }
}
